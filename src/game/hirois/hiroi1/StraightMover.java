package game.hirois.hiroi1;

import game.GraphicsInfo;
import game.hirois.BulletCharaAbstract;
import game.hirois.BulletMover;
import game.hirois.Stage;


public class StraightMover extends BulletMover {
	public void move(GraphicsInfo ginfo, Stage stage, BulletCharaAbstract bullet) {
		if(bullet.position.x < 0 ||
			bullet.position.x > stage.getWidth() ||
			bullet.position.y < 0 ||
			bullet.position.y > stage.getHeight())
		{
			bullet.visible = false;
		}
		bullet.position.x += bullet.vector.x * ginfo.frametime;
		bullet.position.y += bullet.vector.y * ginfo.frametime;
	}

	public static StraightMover singleton = new StraightMover();
}
