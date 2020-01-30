import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UploadmediaComponent } from './uploadmedia/uploadmedia.component';
import { MymediaComponent } from './mymedia/mymedia.component';
import { FollowersComponent } from './followers/followers.component';
import { AccountComponent } from './account/account.component';
import { LoginComponent } from './router-outlet/login/login.component';
import { RegisterComponent } from './router-outlet/register/register.component';


const routes: Routes = [
  {path:"",redirectTo:"uploadmedia",pathMatch:"full"},
  {path:"uploadmedia",component:UploadmediaComponent},
  { path:"mymedia", component: MymediaComponent},
  { path:"followers", component: FollowersComponent},
  { path:"account", component: AccountComponent},
  {path:"login",component:LoginComponent},
  {path:"register",component:RegisterComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
