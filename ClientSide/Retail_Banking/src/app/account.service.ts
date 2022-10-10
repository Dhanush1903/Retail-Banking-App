import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import Statements from 'Entity/statements';
import { Observable, take, tap } from 'rxjs';

const URL="http://localhost:8081/create"

@Injectable({
  providedIn: 'root'
})
export class AccountService {
statements: Statements[];
 

  constructor(public http:HttpClient) { }
  createAccount( accounts:{  
    accountType:string;
    balance:number;
    customerId:number;
    
   
  
    })      
    {
      return this.http.post(URL, accounts)
      }

  getAccount(accountId:number){
    return this.http.get(`http://localhost:8081/getbyaccountId/${accountId}`)
  }

  getCustomerAccounts(customerId:number){
    return this.http.get(`http://localhost:8081/getbycustomerId/${customerId}`)
  }

  depositAmount(accountId:number, accounts:{  
    accountType:string;
    balance:number;
    customerId:number;})
    {
    return this.http.post("http://localhost:8081/deposit"+"/"+accountId,accounts)
  }
  
  withdrawAmount(accountId:number, accounts:{  
    accountType:string;
    balance:number;
    customerId:number;})
    {
    return this.http.post("http://localhost:8081/withdraw"+"/"+accountId,accounts)
  }

  getStatements(accountId:any,from_date:any,to_date:any) {
    return this.http.get<Statements[]>("http://localhost:8081/getstatement/"+accountId+'/'+from_date+'/'+to_date).pipe(take(1),
    tap(data=>this.statements=data));
    // "http://35.164.160.147:8083/searchBy/"
  }

 



}
