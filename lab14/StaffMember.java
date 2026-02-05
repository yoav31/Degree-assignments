package lab14;

import java.util.Objects;

public abstract class StaffMember {
    private Id id;
    private enum Status{INSTAFF,NOTINSTAFF}
    private Status status;

    public StaffMember(Id id){
        this.id= id;
        this.status=Status.INSTAFF;

    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Id getId() {
        return id;
    }

    public abstract double  pay();


    @Override
    public String toString() {
        return "StaffMember{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        StaffMember that = (StaffMember) o;
        return id == that.id;
    }

}





