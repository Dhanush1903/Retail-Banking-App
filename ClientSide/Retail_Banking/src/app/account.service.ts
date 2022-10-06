import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

const URL="http://localhost:8081/create"

@Injectable({
  providedIn: 'root'
})
export class AccountService {

 

  constructor(public http:HttpClient) { }
  createAccount( accounts:{  
    accountType:string;
    balance:number;
    customerId:number;
    
   
  
    }      )      {
      return this.http.post(URL, accounts)
      
  
  }
}
