var menulist = "";

function son(menu){
	if(menu.sonlist.length > 0){

		if(menu.grade == 1){
			menulist += '<li><a href="#"><i class="fa fa-home"></i><span class="nav-label">'+menu.name+'</span><span class="fa arrow"></span></a><ul class="nav nav-second-level">';
		}
		if(menu.grade == 2){
			menulist += '<li><a href="#">'+menu.name+'<span class="fa arrow"></span></a><ul class="nav nav-third-level">';
		}
		if(menu.grade == 3){
			menulist += '<li><a href="#">'+menu.name+'<span class="fa arrow"></span></a><ul class="nav nav-third-level">';
		}

		for(var e=0;e<menu.sonlist.length;e++){
			son(menu.sonlist[e]);
		}
		menulist += '</ul></li>';
	}

	if(menu.sonlist.length == 0 ){
			if(menu.grade == 1){
				menulist += '<li><a class="J_menuItem" href="'+menu.url+'"> <i class="fa fa-home"></i><span class="nav-label">'+menu.name+'</span></a></li>'
			}
			if(menu.grade == 2){
				menulist += '<li><a class="J_menuItem" href="'+menu.url+'" data-index="0">'+menu.name+'</a></li>';
			}
			if(menu.grade == 3){
				menulist += '<li><a class="J_menuItem" href="'+menu.url+'">'+menu.name+'</a></li>';
			}
	}
}

$(document).ready(function(){	
	$.ajax({
		url:'../tree/menu',
		type:'POST',
		async:false,
		dataType:'json',
		success:function(data){
			for(var b = 0 ; b<data.rows.length ; b++){
				var menu = data.rows[b];
				son(menu);
			}
			 $("#side-menu").append(menulist);
		},
		error:function(data){
			console.log(data);
			console.log('error!');
		}
	})
});
