package com.wealthtrace.api.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String assetName;
    private Double amount;
    private Double buyPrice;
    private LocalDateTime createdAt = LocalDateTime.now();
}