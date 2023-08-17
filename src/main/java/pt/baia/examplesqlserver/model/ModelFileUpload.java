package pt.baia.examplesqlserver.model;


import jakarta.persistence.*;
import lombok.Data;

import java.io.File;

@Entity
@Data
@Table(name = "DATAMODEL_FILE")
public class ModelFileUpload {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long modelId;
    private File file_data;

}
