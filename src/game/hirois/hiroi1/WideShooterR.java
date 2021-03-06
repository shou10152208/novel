package game.hirois.hiroi1;

import game.GraphicsInfo;
import game.hirois.Shooter;
import game.hirois.Stage;
import game.hirois.Vector2D;

import java.awt.geom.Point2D;

public class WideShooterR extends Shooter {

	private Vector2D v = new Vector2D();

	@Override
	public void shoot(GraphicsInfo ginfo, Stage stage, Point2D.Double position) {
		this.v.x = -240.0;
		this.v.y = 0.0;
		double r = -30.0 / 180.0 * Math.PI;
		this.v.rotateVector(r);
		r = 20.0 / 180.0 * Math.PI;
		for(int i=0; i<4; i++){
			BulletChara bullet = (BulletChara) stage.searchBullet();
			if(bullet == null) return;
			bullet.mover = StraightMover.singleton;
			bullet.position.x = position.x;
			bullet.position.y = position.y;
			bullet.vector.x = this.v.x;
			bullet.vector.y = this.v.y;
//			bullet.setImage(stage.getBulletImage(Stage1.GREENBULLET_E));
			bullet.setImage(stage.getBulletImage(Stage1.REDBULLET_E));
			bullet.setVisible(ginfo, true);
			this.v.rotateVector(r);
		}

	}

	public static WideShooterR singleton = new WideShooterR();

}
