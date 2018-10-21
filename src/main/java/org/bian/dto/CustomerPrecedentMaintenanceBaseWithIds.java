package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerPrecedentMaintenanceBaseWithIds
 */
public class CustomerPrecedentMaintenanceBaseWithIds   {
  private String customerPrecedentProfileMaintenanceTaskReference = null;

  private String customerPrecedentProfileReference = null;

  private String precedentType = null;

  private String customerPrecedentReference = null;

  private String customerPrecedentMaintenanceSchedule = null;

  private String customerPrecedentMaintenanceTaskReference = null;

  private Object customerPrecedentMaintenanceTask = null;

  private String customerPrecedentMaintenanceTaskResult = null;

  private String customerPrecedentValue = null;

  private Object customerPrecedentProfileUpdateLog = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerPrecedentProfileMaintenanceTaskReference
  **/

  public String getCustomerPrecedentProfileMaintenanceTaskReference() {
    return customerPrecedentProfileMaintenanceTaskReference;
  }

  public void setCustomerPrecedentProfileMaintenanceTaskReference(String customerPrecedentProfileMaintenanceTaskReference) {
    this.customerPrecedentProfileMaintenanceTaskReference = customerPrecedentProfileMaintenanceTaskReference;
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
   * Get customerPrecedentMaintenanceSchedule
   * @return customerPrecedentMaintenanceSchedule
  **/

  public String getCustomerPrecedentMaintenanceSchedule() {
    return customerPrecedentMaintenanceSchedule;
  }

  public void setCustomerPrecedentMaintenanceSchedule(String customerPrecedentMaintenanceSchedule) {
    this.customerPrecedentMaintenanceSchedule = customerPrecedentMaintenanceSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'The reference ID for this maintenance task' 
   * @return customerPrecedentMaintenanceTaskReference
  **/

  public String getCustomerPrecedentMaintenanceTaskReference() {
    return customerPrecedentMaintenanceTaskReference;
  }

  public void setCustomerPrecedentMaintenanceTaskReference(String customerPrecedentMaintenanceTaskReference) {
    this.customerPrecedentMaintenanceTaskReference = customerPrecedentMaintenanceTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'Record of the work done to check value' 
   * @return customerPrecedentMaintenanceTask
  **/

  public Object getCustomerPrecedentMaintenanceTask() {
    return customerPrecedentMaintenanceTask;
  }

  public void setCustomerPrecedentMaintenanceTask(Object customerPrecedentMaintenanceTask) {
    this.customerPrecedentMaintenanceTask = customerPrecedentMaintenanceTask;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Indicator 
   * @return customerPrecedentMaintenanceTaskResult
  **/

  public String getCustomerPrecedentMaintenanceTaskResult() {
    return customerPrecedentMaintenanceTaskResult;
  }

  public void setCustomerPrecedentMaintenanceTaskResult(String customerPrecedentMaintenanceTaskResult) {
    this.customerPrecedentMaintenanceTaskResult = customerPrecedentMaintenanceTaskResult;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'Historical values of precedent profile maintenance/changes' 
   * @return customerPrecedentProfileUpdateLog
  **/

  public Object getCustomerPrecedentProfileUpdateLog() {
    return customerPrecedentProfileUpdateLog;
  }

  public void setCustomerPrecedentProfileUpdateLog(Object customerPrecedentProfileUpdateLog) {
    this.customerPrecedentProfileUpdateLog = customerPrecedentProfileUpdateLog;
  }


}

