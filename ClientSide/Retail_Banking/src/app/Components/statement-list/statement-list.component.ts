import { Component, OnInit } from '@angular/core';
import Account from 'Entity/Account';
import { AccountService } from 'src/app/account.service';

@Component({
  selector: 'app-statement-list',
  templateUrl: './statement-list.component.html',
  styleUrls: ['./statement-list.component.css']
})
export class StatementListComponent implements OnInit {
  account:Account=new Account();
  accounts:Account[]=[];
  alert:boolean=false
  open:boolean=false
  constructor(public accountService:AccountService) { }

  ngOnInit(): void {
  }

  getAccount(accountId:number){
    this.open=true
    const promise=this.accountService.getAccount(accountId); 
    promise.subscribe((response)=>{
      console.log(response);
      this.account=response as Account;
      
    })

}

}
