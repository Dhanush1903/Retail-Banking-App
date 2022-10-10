import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutUsComponent } from './Components/about-us/about-us.component';
import { CustomerAccountComponent } from './Components/customer-account/customer-account.component';
import { DepositComponent } from './Components/deposit/deposit.component';
import { HomeComponent } from './Components/home/home.component';
import { SignUpComponent } from './Components/sign-up/sign-up.component';
import { StatementListComponent } from './Components/statement-list/statement-list.component';
import { StatementsComponent } from './Components/statements/statements.component';

const routes: Routes = [{path:'',component:HomeComponent},
{path:'signUp',component:SignUpComponent},
{path:'customer-account',component:CustomerAccountComponent},
{path:'deposit',component:DepositComponent},
{path:'statements',component:StatementsComponent},
{path:'account',component:StatementListComponent},
{path:'about',component:AboutUsComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
