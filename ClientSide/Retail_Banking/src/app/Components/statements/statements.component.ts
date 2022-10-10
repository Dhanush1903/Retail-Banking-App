import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Statements from 'Entity/statements';
import { Observable, take, tap } from 'rxjs';
import { AccountService } from 'src/app/account.service';

@Component({
  selector: 'app-statements',
  templateUrl: './statements.component.html',
  styleUrls: ['./statements.component.css']
})
export class StatementsComponent implements OnInit {
  statement:Statements= new Statements();
  statements: Statements[];
  alert:boolean=false

  constructor(public accountService:AccountService, public router: Router,public http:HttpClient) { }

  ngOnInit(): void {
  }

  getStatements() {
    const promise = this.accountService.getStatements(this.statement.accountId,this.statement.from_date,this.statement.to_date)
    this.alert=true
    promise.subscribe((response) => {
      console.log(response);
     
      this.statements=response as Statements[];
      
    })

  }

  
}
