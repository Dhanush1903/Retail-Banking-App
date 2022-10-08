import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import Account from 'Entity/Account';
import { AccountService } from 'src/app/account.service';

@Component({
  selector: 'app-customer-account',
  templateUrl: './customer-account.component.html',
  styleUrls: ['./customer-account.component.css']
})
export class CustomerAccountComponent implements OnInit {
  account:Account =new Account();
 accounts:Account[]=[];
  accountId:number;
  alert:boolean=false
  open:boolean=false

  constructor(public accountService:AccountService,private route:ActivatedRoute) { }

  ngOnInit(): void {
    // const promise=this.accountService.getAccount();
    // promise.subscribe((response)=>{
    //   console.log(response);
    //   this.accounts=response as Account[];
    // this.account = new Account();
    // this.accountId=this.route.snapshot.params['accountId'];
    

  }

  getAccount(accountId:number){
    this.alert=true
    const promise=this.accountService.getAccount(accountId); 
    promise.subscribe((response)=>{
      console.log(response);
      this.account=response as Account;
      
    })

}
getCustomerAccounts(customerId:number){
  
  const promise=this.accountService.getCustomerAccounts(customerId); 
  promise.subscribe((response)=>{
    console.log(response);
    this.accounts=response as Account[];
    
  })

}




}
