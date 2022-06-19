package kursach4;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@ToString(callSuper = true)
@Entity
@Getter
@Setter
@NonNull
@NoArgsConstructor

public class Mountain extends BaseId {

    @Column(nullable = false, unique = true)
    private String mName;
    private String country;
    private int high;

    public Mountain(String mName, String country, int high) {
        this.mName = mName;
        this.country = country;
        this.high = high;
    }

    @OneToOne
    @JoinColumn(name = "group_list_id")
    private GroupList groupList;
}