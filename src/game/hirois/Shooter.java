package game.hirois;

import game.GraphicsInfo;
import game.hirois.Stage;

import java.awt.geom.Point2D;

public abstract class Shooter {
	public abstract void shoot(GraphicsInfo ginfo, Stage stage, Point2D.Double position);

}
