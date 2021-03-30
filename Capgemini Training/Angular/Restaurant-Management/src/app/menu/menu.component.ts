import { Component, OnInit,ViewChild } from '@angular/core';
import { MatTable } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';
import { DialogBoxComponent } from '../dialog-box/dialog-box.component';
import { MenuServiceService,PeriodicElement } from '../menu-service.service';



@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  public ROLE=true;

  displayedColumns: string[] = ['position', 'name', 'price','edit','delete','assign'];
  displayedColumns1: string[] = ['position', 'name', 'price'];
  displayedColumns2: string[] = ['position', 'name', 'price','Order'];
  dataSource;

  @ViewChild(MatTable,{static:true}) table: MatTable<any>;
  constructor(public dialog: MatDialog,private menuService: MenuServiceService) { }
 
  ownerState=false;
  adminState=false;
  userState=true;
  ngOnInit(): void {
   this.dataSource= this.menuService.getDataSource();
    this.ownerState= this.menuService.isOwnerLogin();
    this.adminState = this.menuService.isAdminLogin();
   console.log(this.dataSource)
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

  postMenu1(element){
    console.log(element)
    this.menuService.assignToRest1(element);
  }
  postMenu2(element){
    console.log(element)
    this.menuService.assignToRest2(element);
  }
  postMenu3(element){
    console.log(element)
    this.menuService.assignToRest3(element);
  }
  
 // checking if it is admin or owne
  


  
}
