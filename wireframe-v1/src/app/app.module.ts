import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UploadmediaComponent } from './uploadmedia/uploadmedia.component';
import { MymediaComponent } from './mymedia/mymedia.component';
import { FollowersComponent } from './followers/followers.component';
import { MenuComponent } from './menu/menu.component';
import { AccountComponent } from './account/account.component';
import { LoginComponent } from './router-outlet/login/login.component';
import { RegisterComponent } from './router-outlet/register/register.component';

@NgModule({
  declarations: [
    AppComponent,
    UploadmediaComponent,
    MymediaComponent,
    FollowersComponent,
    MenuComponent,
    AccountComponent,
    LoginComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
