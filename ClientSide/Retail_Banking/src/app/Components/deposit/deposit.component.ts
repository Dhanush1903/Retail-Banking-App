import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import Account from 'Entity/Account';
import TransactionStatus from 'Entity/TransactionStatus';
import { AccountService } from 'src/app/account.service';
import Swal from 'sweetalert2'
@Component({
  selector: 'app-deposit',
  templateUrl: './deposit.component.html',
  styleUrls: ['./deposit.component.css']
})
export class DepositComponent implements OnInit {
  account:Account =new Account();
  accounts:Account[]=[];
   accountId:number;
   transactionStatus:TransactionStatus=new TransactionStatus();
   alert:boolean=false
   open:boolean=false
  constructor(public accountService:AccountService,private route:ActivatedRoute) { }

  ngOnInit(): void {
  }

  depositAmount(){
    { 
      const observable= this.accountService.depositAmount(this.account.accountId,this.account); 
      observable.subscribe(
        (response:any)=>{
          console.log(response)
          this.alert=true
          this.transactionStatus=response as TransactionStatus;
          Swal.fire({
            position: 'center',
            icon: 'success',
            title: 'Deposit Sucessfull',
            showConfirmButton: false,
            timer: 1900
          })
          
        }
        ,
        function(error){
          console.log(error);
          alert("Something went wrong please try again!")
        }
      )
  
    }
    
    

  }

  withdrawAmount(){
    { 
      const observable= this.accountService.withdrawAmount(this.account.accountId,this.account); 
      observable.subscribe(
        (response:any)=>{
          console.log(response)
          this.alert=true
          this.transactionStatus=response as TransactionStatus;
          Swal.fire({
            position: 'center',
            icon: 'success',
            title: 'Withdraw Sucessfull',
            showConfirmButton: false,
            timer: 1900
          })
          
        }
        ,
        function(error){
          console.log(error);
          alert("Something went wrong please try again!")
        }
      )
  
    }
    
    

  }

}
