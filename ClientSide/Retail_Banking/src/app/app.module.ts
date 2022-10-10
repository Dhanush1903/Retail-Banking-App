import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './Components/nav-bar/nav-bar.component';
import { HomeComponent } from './Components/home/home.component';
import { SignUpComponent } from './Components/sign-up/sign-up.component';
import { FormsModule } from '@angular/forms';
import{HttpClientModule} from '@angular/common/http';
import { CustomerAccountComponent } from './Components/customer-account/customer-account.component';
import { DepositComponent } from './Components/deposit/deposit.component';
import { StatementsComponent } from './Components/statements/statements.component';
import { StatementListComponent } from './Components/statement-list/statement-list.component';
import { AboutUsComponent } from './Components/about-us/about-us.component';
@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    HomeComponent,
    SignUpComponent,
    CustomerAccountComponent,
    DepositComponent,
    StatementsComponent,
    StatementListComponent,
    AboutUsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
