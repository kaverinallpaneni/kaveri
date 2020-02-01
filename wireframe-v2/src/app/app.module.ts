import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UploadmediaComponent } from './media/uploadmedia/uploadmedia.component';
import { MymediaComponent } from './media/mymedia/mymedia.component';
import { FollowersComponent } from './media/followers/followers.component';
import { AccountComponent } from './media/account/account.component';
import { LoginComponent } from './auth/login/login.component';
import { RegisterComponent } from './auth/register/register.component';
import { HeaderComponent } from './menu/header/header.component';
import { UserheaderComponent } from './menu/userheader/userheader.component';

@NgModule({
  declarations: [
    AppComponent,
    UploadmediaComponent,
    MymediaComponent,
    FollowersComponent,
    AccountComponent,
    LoginComponent,
    RegisterComponent,
    HeaderComponent,
    UserheaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
