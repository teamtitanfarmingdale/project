package game;

import java.awt.image.BufferedImage;

public class Player {
	private BufferedImage[] movingLeft = {Sprite.getSprite(0, 1), Sprite.getSprite(2, 1)}; 
	private BufferedImage[] movingRight = {Sprite.getSprite(0, 2), Sprite.getSprite(2, 2)};
	private BufferedImage[] accelerate = {Sprite.getSprite(1, 0)};

	// These are animation states
	private Animation moveLeft = new Animation(movingLeft, 10);
	private Animation moveRight = new Animation(movingRight, 10);
	private Animation accelerate1 = new Animation(accelerate, 10);

	// This is the actual animation
	private Animation animation = standing1;
}
