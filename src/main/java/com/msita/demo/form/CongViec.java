package com.msita.demo.form;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;
@Entity
@Table(name = "congviec")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CongViec {
    @Id
    private String MaCongViec;
    private String TenCongViec;
    private String MaNganhNghe;

}
