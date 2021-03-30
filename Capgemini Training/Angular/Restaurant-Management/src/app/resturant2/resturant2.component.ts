import { Component, OnInit ,ViewChild} from '@angular/core';
import { MatTable } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';
import {MenuServiceService} from '../menu-service.service';
import {DialogBoxComponent} from '../dialog-box/dialog-box.component'

@Component({
  selector: 'app-resturant2',
  templateUrl: './resturant2.component.html',
  styleUrls: ['./resturant2.component.css']
})
export class Resturant2Component implements OnInit {

  public ROLE=true;

  displayedColumns: string[] = ['position', 'name', 'price','edit','delete'];
  displayedColumns1: string[] = ['position', 'name', 'price'];
  displayedColumns2: string[] = ['position', 'name', 'price','Order'];
  dataSource;
  ownerState=false;
  adminState=false;
  userState=true;


  @ViewChild(MatTable,{static:true}) table: MatTable<any>;
  constructor(public dialog: MatDialog,private menuService: MenuServiceService) { }

  ngOnInit(): void {
   this.dataSource= this.menuService.getDataSourceRest2();
   this.ownerState = this.menuService.isOwnerLogin();
   this.adminState = this.menuService.isAdminLogin();
    
  }
  
  openDialog(action,obj) {
    obj.action = action;
    const dialogRef = this.dialog.open(DialogBoxComponent, {
      width: '250px',
      data:obj
    });

    dialogRef.afterClosed().subscribe(result => {
      if(result.event == 'Add'){
        this.addRowData(result.data);
      }else if(result.event == 'Update'){
        this.updateRowData(result.data);
      }else if(result.event == 'Delete'){
        this.deleteRowData(result.data);
      }
    });
  }

  addRowData(row_obj){
    
    this.dataSource.push(row_obj);
    this.table.renderRows();
    
  }
  updateRowData(row_obj){
    this.dataSource = this.dataSource.filter((value,key)=>{
      if(value.position == row_obj.position){
        value.name = row_obj.name;
      }
      return true;
    });
  }
  deleteRowData(row_obj){
    this.dataSource = this.dataSource.filter((value,key)=>{
      return value.position != row_obj.position;
    });
  }

  orderItem(element){
    alert(" your item :"+element.name+"\n Succesfully Placed");
  }
}
