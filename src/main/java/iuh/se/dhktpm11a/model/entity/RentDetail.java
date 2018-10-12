package iuh.se.dhktpm11a.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "ChiTietPhieuThue")
public class RentDetail {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "maChiTietPhieuThue")
    private String rentDetailId;

    @ManyToOne
    @JoinColumn(name = "maPhieuThue")
    private Rent rent;

    @JoinColumn(name = "maDia")
    @ManyToOne
    private Disk disk;

    @Column(name = "giaThue")
    private int rentPrice;

    @Column(name = "thoiGianThue")
    private int rentDuration;

    @OneToOne(mappedBy = "rentDetail")
    private LateCharge lateCharge;

    public RentDetail() {
    }



    public String getRentDetailId() {
        return rentDetailId;
    }

    public void setRentDetailId(String rentDetailId) {
        this.rentDetailId = rentDetailId;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public LateCharge getLateCharge() {
        return lateCharge;
    }

    public void setLateCharge(LateCharge lateCharge) {
        this.lateCharge = lateCharge;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public int getRentDuration() {
        return rentDuration;
    }

    public void setRentDuration(int rentDuration) {
        this.rentDuration = rentDuration;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "RentDetail{" +
                "rentDetailId='" + rentDetailId + '\'' +
                ", rent=" + rent +
                ", disk=" + disk +
                ", rentPrice=" + rentPrice +
                ", rentDuration=" + rentDuration +
                '}';
    }
}
