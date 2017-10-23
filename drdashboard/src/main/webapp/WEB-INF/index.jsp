<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html lang="en">

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>FullCalender</title>
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.1.0/fullcalendar.min.css" />
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

            <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/moment.js"></script>
            <script src="https://momentjs.com/downloads/moment.min.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.1.0/fullcalendar.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/later/1.2.0/later-core.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/schedulejs/0.6.3/schedule.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


        </head>

        <body>
            <div class="container-fluid">
                <div class="col-sm-10 col-md-10">
                    <h1>Appoinment Scheduler</h1>
                    <div id="calendar"></div>
                </div>
                <div class="col-sm-2 col-md-2">
                    <img src="http://findicons.com/files/icons/1657/lha_objects/128/trash.png" id="trash" alt="">
                </div>

                <div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
                                <h4 class="modal-title" id="myModalLabel">Add Calendar Event</h4>
                            </div>
                            <div class="modal-body">
                                <form:form commandName="event" action="saveEvent" method="post" id="submitForm">

                                    <label for=tittle>Event title</label>
                                    <br>
                                    <form:input path="tittle" type="text" id="tittle" />
                                    <br />

                                    <label for=date>Scheduled date</label>
                                    <br>
                                    <form:input path="date" type="date" id="eventDate" />
                                    <br />

                                    <label for=time>Scheduled time</label>
                                    <br>
                                    <form:input path="time" type="time" id="eventTime" />
                                    <br />

                                    <label for=eventDuration>Appointment length (minutes)</label>
                                    <br>
                                    <form:input path="eventDuration" type="text" id="eventDuration" />
                                    <br />

                                    <div class="modal-footer">
                                        <button type="button" id="btnPopupCancel" class="btn btn-default" data-dismiss="modal">Close</button>
                                        <button type="submit" id="btnPopupSave" class="btn btn-primary">Save
								Event</button>
                                    </div>
                                </form:form>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
                                <h4 class="modal-title" id="myModalLabel">Update Event</h4>
                            </div>
                            <div class="modal-body">
                                <form:form commandName="event" action="updateEvent" method="post" id="updateForm">

                                    <form:input path="id" type="hidden" id="id" />

                                    <label for=tittle>Event title</label>
                                    <br>
                                    <form:input path="tittle" type="text" id="tittle" />
                                    <br />

                                    <label for=date>Scheduled date</label>
                                    <br>
                                    <form:input path="date" type="date" id="eventDate" />
                                    <br />

                                    <label for=time>Scheduled time</label>
                                    <br>
                                    <form:input path="time" type="time" id="eventTime" />
                                    <br />

                                    <label for=eventDuration>Appointment length (minutes)</label>
                                    <br>
                                    <form:input path="eventDuration" type="text" id="eventDuration" />
                                    <br />

                                    <div class="modal-footer">
                                        <button type="button" id="btnPopupCancel" class="btn btn-default" data-dismiss="modal">Close</button>
                                        <button type="submit" id="btnDelete" class="btn btn-warning" data-dismiss="modal">Delete</button>
                                        <button type="submit" id="btnUpdate" class="btn btn-primary">Save Event</button>
                                    </div>
                                </form:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </body>
        <style type="text/css">
            body {
                margin-top: 40px;
                text-align: center;
                font-size: 14px;
                font-family: "Lucida Grande", Helvetica, Arial, Verdana, sans-serif;
            }
            
            #calendar {
                width: 900px;
                height: 200px;
                margin: 0 auto;
            }
            
            .card {
                /* Add shadows to create the "card" effect */
                background: #1283cb;
                width: 70px;
                height: auto;
                position: absolute;
                margin: 10px 0 0 20px;
                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
                transition: 0.3s;
                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
                transition: 0.3s;
                border-radius: 5px;
                padding: 10px 10px 10px 10px;
            }

        </style>



        <script>
            var currentMousePos = {
                x: -1,
                y: -1
            };

            jQuery(document).on("mousemove", function(event) {
                currentMousePos.x = event.pageX;
                currentMousePos.y = event.pageY;
            });

            function isElemOverDiv() {
                var trashEl = jQuery('#trash');
                var ofs = trashEl.offset();
                var x1 = trashEl.offset().left;
                var x2 = ofs.left + trashEl.outerWidth(true);
                var y1 = ofs.top;
                var y2 = ofs.top + trashEl.outerHeight(true);
                if (currentMousePos.x >= x1 && currentMousePos.x <= x2 && currentMousePos.y >= y1 && currentMousePos.y <= y2) {
                    return true;
                }
                return false;
            }
            $("#calendar").fullCalendar({

                header: {
                    left: "prev,next today",
                    center: "title",
                    right: "month,agendaWeek,agendaDay"
                },

                eventLimit: true,
                selectable: true,
                selectHelper: true,
                editable: true,

                eventSources: [{
                    contentType: 'application/json; charset=utf-8',
                    url: 'getEvents',
                    type: 'GET',
                    dataType: 'json',
                    color: 'yellow',
                    textColor: 'black'
                }],

                eventClick: function(data, view) {
                    $.each(data, function(key, value) {
                        $('[name=' + key + ']', $("#updateModal").modal()).val(value);
                    });
                    $('#btnUpdate').click(function() {

                        $('#updateForm').submit(function(e) {
                            var frm = $('#updateForm');
                            e.preventDefault();

                            var data = {}
                            var Form = this;

                            console.log(data);

                            //Gather Data also remove undefined keys(buttons)
                            $.each(this, function(i, v) {
                                var input = $(v);
                                data[input.attr("name")] = input.val();
                                delete data["undefined"];
                            });
                            $.ajax({
                                contentType: 'application/json; charset=utf-8',
                                type: frm.attr('method'),
                                url: frm.attr('action'),
                                dataType: 'json',
                                data: JSON.stringify(data),
                                success: function(response) {

                                    if (response == true) {
                                        alert("Event Sucesssfully updated!!!");
                                        $("#calendar").fullCalendar('refetchEvents');
                                    } else {
                                        alert("There was a problem updating event");
                                    }

                                },
                                error: function() {
                                    $(this).html("Error!");
                                }
                            });
                        });
                        $("#calendar").fullCalendar('refetchEvents');
                    });
                },
                eventDragStop: function(Event, jsEvent, ui, view) {
                    if (isElemOverDiv()) {
                        var con = confirm('Are you sure to delete this event permanently?');
                        if (con == true) {
                            
                            var dataRow = {
                                'id': Event.id,
                                'tittle': Event.tittle,
                                'date':Event.date,
                                'time':Event.time,
                                'eventDuration': Event.eventDuration
                            }
                            
                            $.ajax({
                                contentType: 'application/json; charset=utf-8',
                                url: 'deleteEvent',
                                data: JSON.stringify(dataRow),
                                type: 'POST',
                                dataType: 'json',
                                success: function(response) {
                                    if (response == true)
                                        $('#calendar').fullCalendar('removeEvents',dataRow.id);
                                },
                                error: function(e) {
                                    alert('Error processing your request: ' + e.responseText);
                                }
                            });
                        }
                    }
                },

                eventMouseover: function(data, view) {
                    tooltip = '<div class="tooltiptopicevent" style="width:auto;height:auto;background:#feb811;position:absolute;z-index:10001;padding:10px 10px 10px 10px ;  line-height: 200%;">' + 'title: ' + ': ' + data.tittle + '</br>' + 'Date: ' + ': ' + data.date + '</br>' + 'Time: ' + ': ' + data.time + '</br>' + 'Event Duration: ' + ': ' + data.eventDuration + '</div>';

                    $("body").append(tooltip);
                    $(this).mouseover(function(e) {
                        $(this).css('z-index', 10000);
                        $('.tooltiptopicevent').fadeIn('500');
                        $('.tooltiptopicevent').fadeTo('10', 1.9);
                    }).mousemove(function(e) {
                        $('.tooltiptopicevent').css('top', e.pageY + 10);
                        $('.tooltiptopicevent').css('left', e.pageX + 20);
                    });
                },

                eventMouseout: function(data, view) {
                    $(this).css('z-index', 8);
                    $('.tooltiptopicevent').remove();
                },

                eventRender: function(data, view) {
                    return $('<div class="card">' + data.tittle + '</div>');
                },

                dayClick: function(date, view) {
                    var dates = date.format();
                    date_last_clicked = $(this);
                    $(this).css("background-color", "#bed7f3");
                    $("#addModal").modal();
                }
            });

            $('#btnPopupSave').click(function() {

                $('#submitForm').submit(function(e) {
                    var frm = $('#submitForm');
                    e.preventDefault();

                    var data = {}
                    var Form = this;

                    console.log(data);

                    //Gather Data also remove undefined keys(buttons)
                    $.each(this, function(i, v) {
                        var input = $(v);
                        data[input.attr("name")] = input.val();
                        delete data["undefined"];
                    });
                    $.ajax({
                        contentType: 'application/json; charset=utf-8',
                        type: frm.attr('method'),
                        url: frm.attr('action'),
                        dataType: 'json',
                        data: JSON.stringify(data),
                        success: function(response) {
                            console.log(response);
                        },
                        error: function() {
                            $(this).html("Error!");
                        }
                    });
                    $("#calendar").fullCalendar('refetchEvents');
                });
            });

        </script>

        </html>
