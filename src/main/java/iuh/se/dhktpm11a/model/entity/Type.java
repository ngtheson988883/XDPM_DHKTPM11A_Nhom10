package iuh.se.dhktpm11a.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LoaiDia")
public class Type {
    @Id
    @Column( name = "loaiDia")
    private String diskType;
    @Column(name = "giaThue")
    private int rentPrice;
    @Column(name = "thoiGianThue")
    private int rentTime;

    public Type() {

    }

    public Type(String diskType, int rentPrice, int rentTime) {
        this.diskType = diskType;
        this.rentPrice = rentPrice;
        this.rentTime = rentTime;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public int getRentTime() {
        return rentTime;
    }

    public void setRentTime(int rentTime) {
        this.rentTime = rentTime;
    }

    @Override
    public String toString() {
        return "Type{" +
                "diskType='" + diskType + '\'' +
                ", rentPrice=" + rentPrice +
                ", rentTime=" + rentTime +
                '}';
    }
}
