package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveCustomerPrecedentRecord
 */
public class RetrieveCustomerPrecedentRecord   {
  private String customerPrecedentProfileRecordingRecordReference = null;

  private String customerPrecedentProfileReference = null;

  private String customerReference = null;

  private String customerPrecedentReference = null;

  private String recordingRecordType = null;

  private Object recordingRecord = null;

  private String recordingRecordDateTime = null;

  private String recordingRecordStatus = null;

  private String empolyeeBusinessUnitReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerPrecedentProfileRecordingRecordReference
  **/

  public String getCustomerPrecedentProfileRecordingRecordReference() {
    return customerPrecedentProfileRecordingRecordReference;
  }

  public void setCustomerPrecedentProfileRecordingRecordReference(String customerPrecedentProfileRecordingRecordReference) {
    this.customerPrecedentProfileRecordingRecordReference = customerPrecedentProfileRecordingRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Customer Precedent Profile Reference' 
   * @return customerPrecedentProfileReference
  **/

  public String getCustomerPrecedentProfileReference() {
    return customerPrecedentProfileReference;
  }

  public void setCustomerPrecedentProfileReference(String customerPrecedentProfileReference) {
    this.customerPrecedentProfileReference = customerPrecedentProfileReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Customer Reference' 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'The reference to this Customer Precedent' 
   * @return customerPrecedentReference
  **/

  public String getCustomerPrecedentReference() {
    return customerPrecedentReference;
  }

  public void setCustomerPrecedentReference(String customerPrecedentReference) {
    this.customerPrecedentReference = customerPrecedentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return recordingRecordType
  **/

  public String getRecordingRecordType() {
    return recordingRecordType;
  }

  public void setRecordingRecordType(String recordingRecordType) {
    this.recordingRecordType = recordingRecordType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return recordingRecord
  **/

  public Object getRecordingRecord() {
    return recordingRecord;
  }

  public void setRecordingRecord(Object recordingRecord) {
    this.recordingRecord = recordingRecord;
  }


  /**
   * Get recordingRecordDateTime
   * @return recordingRecordDateTime
  **/

  public String getRecordingRecordDateTime() {
    return recordingRecordDateTime;
  }

  public void setRecordingRecordDateTime(String recordingRecordDateTime) {
    this.recordingRecordDateTime = recordingRecordDateTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return recordingRecordStatus
  **/

  public String getRecordingRecordStatus() {
    return recordingRecordStatus;
  }

  public void setRecordingRecordStatus(String recordingRecordStatus) {
    this.recordingRecordStatus = recordingRecordStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'The business unit reference for this recording request' 
   * @return empolyeeBusinessUnitReference
  **/

  public String getEmpolyeeBusinessUnitReference() {
    return empolyeeBusinessUnitReference;
  }

  public void setEmpolyeeBusinessUnitReference(String empolyeeBusinessUnitReference) {
    this.empolyeeBusinessUnitReference = empolyeeBusinessUnitReference;
  }


}

