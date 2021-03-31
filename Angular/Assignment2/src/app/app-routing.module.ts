import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdvertisementFormComponentComponent } from './advertisement-form-component/advertisement-form-component.component';
import { AdvertisementTableComponentComponent } from './advertisement-table-component/advertisement-table-component.component';
import { EditProductComponentComponent } from './edit-product-component/edit-product-component.component';

const routes: Routes = [
  {path:'advertisementTable',component:AdvertisementTableComponentComponent},
  {path:'advertisement',component:AdvertisementFormComponentComponent},
  {path:'editAds',component:EditProductComponentComponent}
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
