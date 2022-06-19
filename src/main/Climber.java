package kursach4;

import lombok.ToString;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@ToString(callSuper = true)
@Entity
@Getter
@Setter
@NonNull
@NoArgsConstructor
public class Climber extends BaseId {

    @Column(unique = true, nullable = false)
    private String name;
    private String adress;

    public Climber(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @Setter
    private GroupList groupList;
}