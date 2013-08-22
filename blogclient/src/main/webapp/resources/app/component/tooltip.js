define([], function() {

	var tooltip = Backbone.View.extend({

		initialize : function() {

			$(document).tooltip({

				placement : "left",
				delay : {
					show : 100,
					hide : 200
				}
			});
		}
	});

	return tooltip;
});