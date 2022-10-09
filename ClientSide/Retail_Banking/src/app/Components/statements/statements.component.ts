import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Statements from 'Entity/statements';
import { AccountService } from 'src/app/account.service';

@Component({
  selector: 'app-statements',
  templateUrl: './statements.component.html',
  styleUrls: ['./statements.component.css']
})
export class StatementsComponent implements OnInit {
  statement:Statements= new Statements();
  statements:Statements[]=[];

  constructor(public accountService:AccountService, public router: Router) { }

  ngOnInit(): void {
  }

  getStatements() {
    const promise = this.accountService.getStatements(this.statement.accountId,this.statement.from_date,this.statement.to_date);
    promise.subscribe((response) => {
      console.log(response);
      this.statements = response as Statements[];
    })
  }

}
