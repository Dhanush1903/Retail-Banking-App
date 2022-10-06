import { Component, OnInit } from '@angular/core';
import Account from 'Entity/Account';
import AccountCreationStatus from 'Entity/AccountCreationStatus';
import { AccountService } from 'src/app/account.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
  account:Account=new Account();
  accounts:Account[]=[];
  accountCreationStatus:AccountCreationStatus=new AccountCreationStatus();
  alert:boolean=false
  constructor(public accountService:AccountService) { }

  ngOnInit(): void {
  }

  registerAccount(){ 
    const observable= this.accountService.createAccount(this.account); 
    observable.subscribe(
      (response:any)=>{
        console.log(response)
        this.alert=true
        this.accountCreationStatus=response as AccountCreationStatus;
      },
      function(error){
        console.log(error);
        alert("Something went wrong please try again!")
      }
    )

  }

}
