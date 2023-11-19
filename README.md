Rest Endpoint - http://localhost:8080/billingSystem/getPayableAmount

Request Payload - 

{
    "groceryTotal":45,
    "otherItemTotal": 543,
    "percentageBasedEligible":"affiliateStore"
}

note: The {percentageBasedEligible} it can we based on the condition given by the user.
  it can be: 
  1). affiliateStore -- 10%
  2). storeEmployee -- 30%
  3). customer -- 5%

Response - 
  {
    "Table PayableAmount": 509
  }
