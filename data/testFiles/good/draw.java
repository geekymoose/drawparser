/*
 * Draw a funny draw on the sceen :p 
 */
prog{
	var tmp;
	var angle;
	var max_width;
	var max_hight;
	var x_pos;
	var y_pos;

	max_width 	= 600;
	max_hight 	= 600;
	x_pos 		= 0;
	y_pos 		= 0;


	//Draw the ground
	tmp = 0;
	while(tmp == 0){
		y_pos = y_pos + 1;
		if(y_pos == ( (max_hight+(max_hight/3)/2) )){
			tmp = 1;
		}
	}
	move 	y_pos;
	down;
	angle 	= 90;
	rotate 	angle;
	x_pos 	= 100;
	move 	x_pos;
	angle 	= 35;
	rotate 	angle;
	x_pos 	= 250;
	move 	x_pos;
	rotate 	angle - (35*3);
	x_pos 	= 250;
	move 	x_pos;
	angle 	= angle + (35);
	rotate angle;

	//Finish the line till right border
	tmp = 0; 
	while (tmp == 0){
		x_pos = x_pos +  1;
		if(x_pos == max_width){
			tmp = 1;
		}
	}
	move 	x_pos;

	//Draw the ugly man!!
	up;
	angle 	= angle + 80;
	rotate 	angle;
	move 	300;

	down;
	for(10){
		move 20;
		rotate 10;
	}
}