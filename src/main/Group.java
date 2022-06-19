package kursach4;

import java.util.Arrays;

import hw6.climbers.properties.Climber;
import hw6.climbers.properties.Mountain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@NonNull
@NoArgsConstructor

public class Group {
    private String groupName;
    private boolean openGroup;
    private Climber[] climbers;

    private Mountain mountain;

    public  Group (boolean openGroup, Mountain mountain, Climber[] climbers){
        setOpenGroup(openGroup);
        setMountain(mountain);
        setClimbers(climbers);
    }
    public  void  addClimber(Climber climber){
        if (!openGroup){
            System.out.println("мест нет");
        } else {
            for (int i = 0; i < climbers.length; i++){
                if (climbers[i] == null){
                    climbers[i] = climber;
                    return;
                }
            }
            System.out.println("Набор в группу окончен");
            openGroup = false;
        }
    }

    public  void addClimbers(Climber...climbers){
        for(Climber climber: climbers){
            addClimbers(climbers);
        }
    }