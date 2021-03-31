import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {ELEMENT_DATA} from './menu'
import { Observable } from 'rxjs';

export interface PeriodicElement {
  name: string;
  position: number;
  price: number;
}

@Injectable({
  providedIn: 'root'
})

export class MenuServiceService {
  
  dataSource = [
    {position: 1, name: 'Tandoori Momos', price: 70 },
    {position: 2, name: 'Tandoori Ghobi Tikka', price:80 }, 
    {position: 3, name: 'Tandoori Aloo', price: 80, },
    {position: 4, name: 'Tandoori Tikka', price: 100, },
    {position: 5, name: 'Tandoori Paneer Tikka', price: 110, },
    {position: 6, name: 'Soya Chaap', price: 120, }, 
    {position: 7, name: 'Veg Sizzler', price: 150, },
    {position: 8, name: 'Indian Sizzler', price:160, },
    {position: 9, name: 'Chinese Sizzler', price: 160, },
    {position: 10, name: 'Veggie Burger', price: 40, },
  ];

  constructor(private http:HttpClient) { }

  getDataSource(){
    return this.dataSource;
  }

  dataSourceMenu1=[];
  dataSourceMenu2=[];
  dataSourceMenu3=[];

  assignToRest1(obj){
    this.dataSourceMenu1.push(obj);
  }
  assignToRest2(obj){
    this.dataSourceMenu2.push(obj);
  }
  assignToRest3(obj){
    this.dataSourceMenu3.push(obj);
  }

 
  getDataSourceRest1(){
    return this.dataSourceMenu1;
  }
  getDataSourceRest2(){
    return this.dataSourceMenu2;
  }
  getDataSourceRest3(){
    return this.dataSourceMenu3;
  }

  adminstate=false;
  ownerState=false;

  UpdateAdminState(state){
    this.adminstate = state;
  }
  
  isAdminLogin(){
    return this.adminstate;
  }
  UpdateOwnerState(state){
    this.ownerState = state;
  }
  isOwnerLogin(){
    return this.ownerState;
  }

}
