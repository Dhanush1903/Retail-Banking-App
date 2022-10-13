import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Account from 'Entity/Account';
import AccountCreationStatus from 'Entity/AccountCreationStatus';
import { AccountService } from 'src/app/account.service';
import Swal from 'sweetalert2'
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
  open:boolean=false
  constructor(public accountService:AccountService, public router: Router) { }

  ngOnInit(): void {
  }

  registerAccount(){ 
    const observable= this.accountService.createAccount(this.account); 
    observable.subscribe(
      (response:any)=>{
        console.log(response)
        
        this.accountCreationStatus=response as AccountCreationStatus;
        this.alert=true
        Swal.fire({
          position: 'center',
          icon: 'success',
          title: 'Registered Sucessfully',
          showConfirmButton: false,
          timer: 1900
        })
        
      }
      ,
      function(error){
        console.log(error);
        alert("Input fields cannot be Blank")
      }
    )

  }



}
