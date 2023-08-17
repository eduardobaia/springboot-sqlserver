package pt.baia.examplesqlserver.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "INSERT_DATAMODEL")
@Data
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long DataModelId;


    private String  modelname;

    private String  modelDesc;

    private String  modeltypeid;

    private int  modelinglevelid;

    private boolean link2dd;

    private int workflowdefinition_id;

    private String  userName;

    private long ApplicationID;

    private long ProjectID;

   // @new_datamodel_id numeric(10) OUTPUT,

//    @canCreate int OUTPUT


}
