import { Component, EventEmitter, Input, OnInit,Output,ViewChild } from '@angular/core';
import { MatTable } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';
import { EditProductComponentComponent } from '../edit-product-component/edit-product-component.component';
import {AdvertisementServiceService} from '../advertisement-service.service'

@Component({
  selector: 'app-advertisement-table-component',
  templateUrl: './advertisement-table-component.component.html',
  styleUrls: ['./advertisement-table-component.component.css']
})
export class AdvertisementTableComponentComponent implements OnInit {
  @Input('parentData') public name1;
  
   public msg="edit";
   
   search="";

   isSearched=true;




  // parent communication 
  @Output() public childEvent = new EventEmitter();
  
  displayedColumns: string[] = ['title', 'name', 'category', 'discription'];



  deleteData(id){
    for(let i = 0; i < this.name1.length; ++i){
      if (this.name1[i].title === id) {
          this.name1.splice(i,1);
      }
  }
  }
  

  
  

  @ViewChild(MatTable,{static:true}) table: MatTable<any>;
  constructor(public dialog: MatDialog,private adsService:AdvertisementServiceService) { }

  ngOnInit(): void {
    this.name1 = this.adsService.getAllAdvertises();
    console.log(this.name1);
  }
  
  // using services delete
  deleteDataApi(obj){
   this.name1= this.adsService.deleteAdvertise(obj);
  }

 // using service search
 
 searchAd(){
   console.log(this.search);
   this.name1=this.adsService.getAdvertise(this.search);
}


  openDialog(action,obj) {
    obj.action = action;
    const dialogRef = this.dialog.open(EditProductComponentComponent, {
      width: '250px',
      data:obj
    });

    dialogRef.afterClosed().subscribe(result => {
       if(result.event == 'Update'){
        this.updateRowData(result.data);
      }
    });
  }

  
  // update using service
  updateRow(obj){
    this.name1=this.adsService.updateAdvertise(obj);
  }


  updateRowData(row_obj){
    this.name1 = this.name1.filter((value,key)=>{
      if(value.title == row_obj.title){
        value.name = row_obj.name;
      }
      return true;
    });
  }

  
  
}
