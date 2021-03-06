package game.hirois.hiroi2;

import game.GraphicsInfo;
import game.hirois.Shooter;
import game.hirois.Stage;

import java.awt.geom.Point2D;
import java.util.Random;

public class TwinShooter extends Shooter {

	@Override
	public void shoot(GraphicsInfo ginfo, Stage stage, Point2D.Double position) {

        Random r = new Random();

		for(int i=0; i<2; i++){
			BulletChara bullet = (BulletChara) stage.searchBullet();
			if(bullet == null) return;
			bullet.mover = StraightMover.singleton;
			bullet.position.x =    r.nextInt(780);          //乱数を取得する
					//position.x -20 + (40 * i);
			bullet.position.y = 10;
			bullet.vector.x = 0;
			bullet.vector.y = 400;
			bullet.setImage(stage.getBulletImage(Stage1.INA));
			bullet.setVisible(ginfo, true);
		}

	}

	public static TwinShooter singleton = new TwinShooter();

}
