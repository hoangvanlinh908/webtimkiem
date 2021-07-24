package com.msita.demo.form;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "congviecungvien")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CongViecUngVien {
    @Id
    private String MaCongViecUV;
    private String ViTriUngTuyen;
    private String CapBacMongMuon;
    private float LuongMin;
    private float LuongMax;
    private String HinhThucLamViec;
    private String NoiLamViec;
    private String MucTieu;

}
