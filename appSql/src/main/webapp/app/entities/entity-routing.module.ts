import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'a',
        data: { pageTitle: 'appSqlApp.appSqlA.home.title' },
        loadChildren: () => import('./appSql/a/a.module').then(m => m.AppSqlAModule),
      },
      {
        path: 'b',
        data: { pageTitle: 'appSqlApp.appSqlB.home.title' },
        loadChildren: () => import('./appSql/b/b.module').then(m => m.AppSqlBModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class EntityRoutingModule {}
