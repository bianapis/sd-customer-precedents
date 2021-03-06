package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerPrecedentCaptureBaseWIthIds
 */
public class CustomerPrecedentCaptureBaseWIthIds   {
  private String customerPrecedentProfileCaptureTaskReference = null;

  private String customerPrecedentProfileReference = null;

  private Object customerPrecedentProfileRecord = null;

  private String customerReference = null;

  private String precedentType = null;

  private String customerPrecedentReference = null;

  private String customerPrecedentValue = null;

  private String customerPrecedentValueDate = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'The reference to this capture task' 
   * @return customerPrecedentProfileCaptureTaskReference
  **/

  public String getCustomerPrecedentProfileCaptureTaskReference() {
    return customerPrecedentProfileCaptureTaskReference;
  }

  public void setCustomerPrecedentProfileCaptureTaskReference(String customerPrecedentProfileCaptureTaskReference) {
    this.customerPrecedentProfileCaptureTaskReference = customerPrecedentProfileCaptureTaskReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'The collection of precedents for a customer' 
   * @return customerPrecedentProfileRecord
  **/

  public Object getCustomerPrecedentProfileRecord() {
    return customerPrecedentProfileRecord;
  }

  public void setCustomerPrecedentProfileRecord(Object customerPrecedentProfileRecord) {
    this.customerPrecedentProfileRecord = customerPrecedentProfileRecord;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return precedentType
  **/

  public String getPrecedentType() {
    return precedentType;
  }

  public void setPrecedentType(String precedentType) {
    this.precedentType = precedentType;
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
   * @return customerPrecedentValue
  **/

  public String getCustomerPrecedentValue() {
    return customerPrecedentValue;
  }

  public void setCustomerPrecedentValue(String customerPrecedentValue) {
    this.customerPrecedentValue = customerPrecedentValue;
  }


  /**
   * Get customerPrecedentValueDate
   * @return customerPrecedentValueDate
  **/

  public String getCustomerPrecedentValueDate() {
    return customerPrecedentValueDate;
  }

  public void setCustomerPrecedentValueDate(String customerPrecedentValueDate) {
    this.customerPrecedentValueDate = customerPrecedentValueDate;
  }


}

