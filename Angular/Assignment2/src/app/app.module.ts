import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdvertisementFormComponentComponent } from './advertisement-form-component/advertisement-form-component.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {FormsModule} from '@angular/forms'
import {MaterialModule} from './material/material.module';
import { AdvertisementTableComponentComponent } from './advertisement-table-component/advertisement-table-component.component';
import { EditProductComponentComponent } from './edit-product-component/edit-product-component.component'

@NgModule({
  declarations: [
    AppComponent,
    AdvertisementFormComponentComponent,
    AdvertisementTableComponentComponent,
    EditProductComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    MaterialModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
