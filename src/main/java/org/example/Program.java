package org.example;

import org.example.models.TableModel;
import org.example.presenters.BookingPresenter;
import org.example.presenters.Model;
import org.example.presenters.View;
import org.example.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * Программа выполняет бронирование столика номер 2, после чего бронь отменяется и создается новая на новую дату и другой столик
     * @param args
     */
    public static void main(String[] args) {

        Model tableModel = new TableModel();
        View bookingView = new BookingView();
        BookingPresenter presenter = new BookingPresenter(tableModel, bookingView);
        presenter.updateUIShowTables();

        tableModel.printAllReservation();

        bookingView.reservationTable(new Date(), 2, "Станислав");

        tableModel.printAllReservation();

        bookingView.changeReservationTable(1001, new Date(), 3, "Станислав");

        tableModel.printAllReservation();

        bookingView.reservationTable(new Date(), 2, "Алексей");

        tableModel.printAllReservation();
    }

}