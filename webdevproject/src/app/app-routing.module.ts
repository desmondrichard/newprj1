import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllUsersComponent } from './all-users/all-users.component';
import { CfiComponent } from './cfi/cfi.component';
import { RegistersComponent } from './registers/registers.component';
import { SearchComponent } from './search/search.component';

const routes: Routes = [
  {
    path : "" ,redirectTo : "cfi" ,pathMatch : "full"  /*pathmatch for saying it is a homecomponent in url*/
  },

{
  path: "search" , component : SearchComponent
},
{
  path: "all-users", component : AllUsersComponent
},
{
  path: "register", component : RegistersComponent
},
{
  path: "cfi" ,component : CfiComponent
},
{
  path: "**" , component : CfiComponent
}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
