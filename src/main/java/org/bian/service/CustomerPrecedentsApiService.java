/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerPrecedentsApiService {

	CustomerPrecedentCaptureBaseWIthIds executePostCaptures(String crReferenceId, CustomerPrecedentCaptureBase request);
	
	CustomerPrecedentCaptureBaseWIthIds executePutCaptures(String crReferenceId, String bqReferenceId, CustomerPrecedentCaptureBase request);
	
	CustomerPrecedentsRecordResponse record(String crReferenceId, CustomerPrecedentsRecordRequest request);
	
	CustomerPrecedentCaptureRefreshResponse requestPutCaptures(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveRefIds();
	
	List<String> retrieveBQs();
	
	CustomerPrecedentCaptureBaseWIthIds retrieveCaptures(String crReferenceId, String bqReferenceId);
	
	CustomerPrecedentMaintenanceBaseWithIds retrieveMaintenance(String crReferenceId, String bqReferenceId);
	
	CustomerPrecedentsBaseWithId retrieve(String crReferenceId);
	
	RetrieveCustomerPrecedentRecord retrieveRecords(String crReferenceId, String bqReferenceId);
	
	CustomerPrecedentsBaseWithId updateCaptures(String crReferenceId, String bqReferenceId, CustomerPrecedentBase request);
	
}
