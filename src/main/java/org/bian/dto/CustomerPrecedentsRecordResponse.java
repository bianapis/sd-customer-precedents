package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerPrecedentsRecordResponse
 */
public class CustomerPrecedentsRecordResponse   {
  private String customerPrecedentProfileRecordingRecordReference = null;

  private String recordingRecordStatus = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return recordingRecordStatus
  **/

  public String getRecordingRecordStatus() {
    return recordingRecordStatus;
  }

  public void setRecordingRecordStatus(String recordingRecordStatus) {
    this.recordingRecordStatus = recordingRecordStatus;
  }


}

