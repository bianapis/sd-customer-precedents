/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CustomerPrecedentsApiController {

	@Autowired
	CustomerPrecedentsApiService service;
	
	@BQ("captures")
	@Process.ExecutePost
	public BianResponse<CustomerPrecedentCaptureBaseWIthIds> executePostCaptures(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerPrecedentCaptureBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostCaptures(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("captures")
	@Process.ExecutePut
	public BianResponse<CustomerPrecedentCaptureBaseWIthIds> executePutCaptures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerPrecedentCaptureBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutCaptures(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<CustomerPrecedentsRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerPrecedentsRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("captures")
	@Process.RequestPut
	public BianResponse<CustomerPrecedentCaptureRefreshResponse> requestPutCaptures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.requestPutCaptures(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("captures")
	@Process.Retrieve
	public BianResponse<CustomerPrecedentCaptureBaseWIthIds> retrieveCaptures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCaptures(crReferenceId, bqReferenceId));
	}
	
	@BQ("maintenance")
	@Process.Retrieve
	public BianResponse<CustomerPrecedentMaintenanceBaseWithIds> retrieveMaintenance(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMaintenance(crReferenceId, bqReferenceId));
	}
	
	@Process.Retrieve
	public BianResponse<CustomerPrecedentsBaseWithId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("records")
	@Process.Retrieve
	public BianResponse<RetrieveCustomerPrecedentRecord> retrieveRecords(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRecords(crReferenceId, bqReferenceId));
	}
	
	@BQ("captures")
	@Process.Update
	public BianResponse<CustomerPrecedentsBaseWithId> updateCaptures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerPrecedentBase> bianRequest) {
		return BianResponse.forSuccess(service.updateCaptures(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
