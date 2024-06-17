package jp.ac.morijyobi.equipmentmanagementsystem.bean.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipment {
    private int id;
    private String name;
    private int categoryId;
    private int storageLocationId;
    private EquipmentState state;
    private int lendingPeriod;
    private int notificationDate;
    private String remark;
    private LocalDateTime createdAt;
}
