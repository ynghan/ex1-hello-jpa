package hellojpa;

import javax.persistence.*;


@Entity
public class Member {
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String uesrname;

//    @Column(name = "TEAM_ID")
//    private Long teamId;


//    @OneToOne
//    @JoinColumn(name = "LOCKER_ID")
//    private Locker locker;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUesrname() {
        return uesrname;
    }

    public void setUesrname(String uesrname) {
        this.uesrname = uesrname;
    }

}
