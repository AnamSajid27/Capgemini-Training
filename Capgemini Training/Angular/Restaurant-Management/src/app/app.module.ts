import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AdminComponent } from './admin/admin.component';
import {MaterialModule} from './material/material.module';
import { MenuComponent } from './menu/menu.component';
import { ResturantComponent } from './resturant/resturant.component';
import { DialogBoxComponent } from './dialog-box/dialog-box.component';
import { Resturant1Component } from './resturant1/resturant1.component';
import { Resturant2Component } from './resturant2/resturant2.component';
import { Resturant3Component } from './resturant3/resturant3.component';
import {HttpClientModule} from '@angular/common/http';
import { LoginComponent } from './login/login.component'

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    MenuComponent,
    ResturantComponent,
    DialogBoxComponent,
    Resturant1Component,
    Resturant2Component,
    Resturant3Component,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
