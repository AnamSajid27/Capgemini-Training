import { Component, EventEmitter, OnInit,Output,ViewChild } from '@angular/core';
import {adsModel} from '../adsModel';
import { MatTable } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';






@Component({
  selector: 'app-advertisement-form-component',
  templateUrl: './advertisement-form-component.component.html',
  styleUrls: ['./advertisement-form-component.component.css']
})
export class AdvertisementFormComponentComponent implements OnInit {
  
  @ViewChild(MatTable,{static:true}) table: MatTable<any>;

  public Myname="Neeraj";
  public categoryList =['Furniture', 'Hardware' , 'Mobile']
  
  ads = new adsModel("","","","");
  
  adsList=[];

  dataSource=[];
  displayedColumns: string[] = ['title', 'name', 'category', 'discription'];
  
  
  // parent communication 
  @Output() public childEvent = new EventEmitter();
  
  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  isSubmitted=false;
  onSubmit(){

    this.adsList.push(this.ads);
    let obj ={
      title:this.ads.title,
      name:this.ads.name,
      category:this.ads.category,
      discription:this.ads.discription
    }
    this.dataSource.push(obj);
    this.isSubmitted=true;

    this.childEvent.emit(this.dataSource);
    //this.router.navigate(["advertisementTable"]);

  }

 

}
