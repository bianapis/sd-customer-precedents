/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerPrecedentsApiServiceImpl implements CustomerPrecedentsApiService {

	public CustomerPrecedentCaptureBaseWIthIds executePostCaptures(String crReferenceId, CustomerPrecedentCaptureBase request){
		return JsonReader.read("executePost-CustomerPrecedentCaptureBaseWIthIds.json",new TypeReference<CustomerPrecedentCaptureBaseWIthIds>(){});
	}
	
	public CustomerPrecedentCaptureBaseWIthIds executePutCaptures(String crReferenceId, String bqReferenceId, CustomerPrecedentCaptureBase request){
		return JsonReader.read("executePut-CustomerPrecedentCaptureBaseWIthIds.json",new TypeReference<CustomerPrecedentCaptureBaseWIthIds>(){});
	}
	
	public CustomerPrecedentsRecordResponse record(String crReferenceId, CustomerPrecedentsRecordRequest request){
		return JsonReader.read("record-CustomerPrecedentsRecordResponse.json",new TypeReference<CustomerPrecedentsRecordResponse>(){});
	}
	
	public CustomerPrecedentCaptureRefreshResponse requestPutCaptures(String crReferenceId, String bqReferenceId){
		return JsonReader.read("requestPut-CustomerPrecedentCaptureRefreshResponse.json",new TypeReference<CustomerPrecedentCaptureRefreshResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerPrecedentCaptureBaseWIthIds retrieveCaptures(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerPrecedentCaptureBaseWIthIds.json",new TypeReference<CustomerPrecedentCaptureBaseWIthIds>(){});
	}
	
	public CustomerPrecedentMaintenanceBaseWithIds retrieveMaintenance(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerPrecedentMaintenanceBaseWithIds.json",new TypeReference<CustomerPrecedentMaintenanceBaseWithIds>(){});
	}
	
	public CustomerPrecedentsBaseWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CustomerPrecedentsBaseWithId.json",new TypeReference<CustomerPrecedentsBaseWithId>(){});
	}
	
	public RetrieveCustomerPrecedentRecord retrieveRecords(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RetrieveCustomerPrecedentRecord.json",new TypeReference<RetrieveCustomerPrecedentRecord>(){});
	}
	
	public CustomerPrecedentsBaseWithId updateCaptures(String crReferenceId, String bqReferenceId, CustomerPrecedentBase request){
		return JsonReader.read("update-CustomerPrecedentsBaseWithId.json",new TypeReference<CustomerPrecedentsBaseWithId>(){});
	}
	
}
