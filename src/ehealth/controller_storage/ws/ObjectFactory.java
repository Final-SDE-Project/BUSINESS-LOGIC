
package ehealth.controller_storage.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ehealth.controller_storage.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReadPersonHistoryResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "readPersonHistoryResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "updatePersonResponse");
    private final static QName _ReadPersonHistory_QNAME = new QName("http://ws.controller_storage.ehealth/", "readPersonHistory");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "readPersonResponse");
    private final static QName _ReadPerson_QNAME = new QName("http://ws.controller_storage.ehealth/", "readPerson");
    private final static QName _ReadBmiResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "readBmiResponse");
    private final static QName _ReadQuoteResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "readQuoteResponse");
    private final static QName _ReadPersonMeasure_QNAME = new QName("http://ws.controller_storage.ehealth/", "readPersonMeasure");
    private final static QName _ReadPersonMeasureResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "readPersonMeasureResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.controller_storage.ehealth/", "updatePerson");
    private final static QName _ReadLatestGoalList_QNAME = new QName("http://ws.controller_storage.ehealth/", "readLatestGoalList");
    private final static QName _DeletePerson_QNAME = new QName("http://ws.controller_storage.ehealth/", "deletePerson");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "createPersonResponse");
    private final static QName _UpdateGoalResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "updateGoalResponse");
    private final static QName _SavePersonMeasure_QNAME = new QName("http://ws.controller_storage.ehealth/", "savePersonMeasure");
    private final static QName _SavePersonMeasureResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "savePersonMeasureResponse");
    private final static QName _CreatePerson_QNAME = new QName("http://ws.controller_storage.ehealth/", "createPerson");
    private final static QName _ReadMeasureTypeResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "readMeasureTypeResponse");
    private final static QName _UpdateGoal_QNAME = new QName("http://ws.controller_storage.ehealth/", "updateGoal");
    private final static QName _ReadMeasureTypes_QNAME = new QName("http://ws.controller_storage.ehealth/", "readMeasureTypes");
    private final static QName _ReadBmi_QNAME = new QName("http://ws.controller_storage.ehealth/", "readBmi");
    private final static QName _UpdatePersonMeasure_QNAME = new QName("http://ws.controller_storage.ehealth/", "updatePersonMeasure");
    private final static QName _ReadPersonListResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "readPersonListResponse");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "deletePersonResponse");
    private final static QName _ReadMeasureHistoriesByDate_QNAME = new QName("http://ws.controller_storage.ehealth/", "readMeasureHistoriesByDate");
    private final static QName _ReadMeasureHistoriesByDateResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "readMeasureHistoriesByDateResponse");
    private final static QName _ReadMeasureType_QNAME = new QName("http://ws.controller_storage.ehealth/", "readMeasureType");
    private final static QName _UpdatePersonMeasureResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "updatePersonMeasureResponse");
    private final static QName _ReadPersonList_QNAME = new QName("http://ws.controller_storage.ehealth/", "readPersonList");
    private final static QName _SaveGoalResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "saveGoalResponse");
    private final static QName _ReadQuote_QNAME = new QName("http://ws.controller_storage.ehealth/", "readQuote");
    private final static QName _SaveGoal_QNAME = new QName("http://ws.controller_storage.ehealth/", "saveGoal");
    private final static QName _ReadMeasureTypesResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "readMeasureTypesResponse");
    private final static QName _ReadGoalListResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "readGoalListResponse");
    private final static QName _ReadLatestGoalListResponse_QNAME = new QName("http://ws.controller_storage.ehealth/", "readLatestGoalListResponse");
    private final static QName _ReadGoalList_QNAME = new QName("http://ws.controller_storage.ehealth/", "readGoalList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ehealth.controller_storage.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveGoal }
     * 
     */
    public SaveGoal createSaveGoal() {
        return new SaveGoal();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesResponse }
     * 
     */
    public ReadMeasureTypesResponse createReadMeasureTypesResponse() {
        return new ReadMeasureTypesResponse();
    }

    /**
     * Create an instance of {@link ReadGoalListResponse }
     * 
     */
    public ReadGoalListResponse createReadGoalListResponse() {
        return new ReadGoalListResponse();
    }

    /**
     * Create an instance of {@link ReadLatestGoalListResponse }
     * 
     */
    public ReadLatestGoalListResponse createReadLatestGoalListResponse() {
        return new ReadLatestGoalListResponse();
    }

    /**
     * Create an instance of {@link ReadGoalList }
     * 
     */
    public ReadGoalList createReadGoalList() {
        return new ReadGoalList();
    }

    /**
     * Create an instance of {@link ReadPersonListResponse }
     * 
     */
    public ReadPersonListResponse createReadPersonListResponse() {
        return new ReadPersonListResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureHistoriesByDate }
     * 
     */
    public ReadMeasureHistoriesByDate createReadMeasureHistoriesByDate() {
        return new ReadMeasureHistoriesByDate();
    }

    /**
     * Create an instance of {@link ReadMeasureHistoriesByDateResponse }
     * 
     */
    public ReadMeasureHistoriesByDateResponse createReadMeasureHistoriesByDateResponse() {
        return new ReadMeasureHistoriesByDateResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureType }
     * 
     */
    public ReadMeasureType createReadMeasureType() {
        return new ReadMeasureType();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasureResponse }
     * 
     */
    public UpdatePersonMeasureResponse createUpdatePersonMeasureResponse() {
        return new UpdatePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadPersonList }
     * 
     */
    public ReadPersonList createReadPersonList() {
        return new ReadPersonList();
    }

    /**
     * Create an instance of {@link SaveGoalResponse }
     * 
     */
    public SaveGoalResponse createSaveGoalResponse() {
        return new SaveGoalResponse();
    }

    /**
     * Create an instance of {@link ReadQuote }
     * 
     */
    public ReadQuote createReadQuote() {
        return new ReadQuote();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link UpdateGoalResponse }
     * 
     */
    public UpdateGoalResponse createUpdateGoalResponse() {
        return new UpdateGoalResponse();
    }

    /**
     * Create an instance of {@link SavePersonMeasure }
     * 
     */
    public SavePersonMeasure createSavePersonMeasure() {
        return new SavePersonMeasure();
    }

    /**
     * Create an instance of {@link SavePersonMeasureResponse }
     * 
     */
    public SavePersonMeasureResponse createSavePersonMeasureResponse() {
        return new SavePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link ReadMeasureTypeResponse }
     * 
     */
    public ReadMeasureTypeResponse createReadMeasureTypeResponse() {
        return new ReadMeasureTypeResponse();
    }

    /**
     * Create an instance of {@link UpdateGoal }
     * 
     */
    public UpdateGoal createUpdateGoal() {
        return new UpdateGoal();
    }

    /**
     * Create an instance of {@link ReadMeasureTypes }
     * 
     */
    public ReadMeasureTypes createReadMeasureTypes() {
        return new ReadMeasureTypes();
    }

    /**
     * Create an instance of {@link ReadBmi }
     * 
     */
    public ReadBmi createReadBmi() {
        return new ReadBmi();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasure }
     * 
     */
    public UpdatePersonMeasure createUpdatePersonMeasure() {
        return new UpdatePersonMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonHistoryResponse }
     * 
     */
    public ReadPersonHistoryResponse createReadPersonHistoryResponse() {
        return new ReadPersonHistoryResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonHistory }
     * 
     */
    public ReadPersonHistory createReadPersonHistory() {
        return new ReadPersonHistory();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link ReadBmiResponse }
     * 
     */
    public ReadBmiResponse createReadBmiResponse() {
        return new ReadBmiResponse();
    }

    /**
     * Create an instance of {@link ReadQuoteResponse }
     * 
     */
    public ReadQuoteResponse createReadQuoteResponse() {
        return new ReadQuoteResponse();
    }

    /**
     * Create an instance of {@link ReadPersonMeasure }
     * 
     */
    public ReadPersonMeasure createReadPersonMeasure() {
        return new ReadPersonMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureResponse }
     * 
     */
    public ReadPersonMeasureResponse createReadPersonMeasureResponse() {
        return new ReadPersonMeasureResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link ReadLatestGoalList }
     * 
     */
    public ReadLatestGoalList createReadLatestGoalList() {
        return new ReadLatestGoalList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readPersonHistoryResponse")
    public JAXBElement<ReadPersonHistoryResponse> createReadPersonHistoryResponse(ReadPersonHistoryResponse value) {
        return new JAXBElement<ReadPersonHistoryResponse>(_ReadPersonHistoryResponse_QNAME, ReadPersonHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readPersonHistory")
    public JAXBElement<ReadPersonHistory> createReadPersonHistory(ReadPersonHistory value) {
        return new JAXBElement<ReadPersonHistory>(_ReadPersonHistory_QNAME, ReadPersonHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBmiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readBmiResponse")
    public JAXBElement<ReadBmiResponse> createReadBmiResponse(ReadBmiResponse value) {
        return new JAXBElement<ReadBmiResponse>(_ReadBmiResponse_QNAME, ReadBmiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readQuoteResponse")
    public JAXBElement<ReadQuoteResponse> createReadQuoteResponse(ReadQuoteResponse value) {
        return new JAXBElement<ReadQuoteResponse>(_ReadQuoteResponse_QNAME, ReadQuoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readPersonMeasure")
    public JAXBElement<ReadPersonMeasure> createReadPersonMeasure(ReadPersonMeasure value) {
        return new JAXBElement<ReadPersonMeasure>(_ReadPersonMeasure_QNAME, ReadPersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readPersonMeasureResponse")
    public JAXBElement<ReadPersonMeasureResponse> createReadPersonMeasureResponse(ReadPersonMeasureResponse value) {
        return new JAXBElement<ReadPersonMeasureResponse>(_ReadPersonMeasureResponse_QNAME, ReadPersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLatestGoalList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readLatestGoalList")
    public JAXBElement<ReadLatestGoalList> createReadLatestGoalList(ReadLatestGoalList value) {
        return new JAXBElement<ReadLatestGoalList>(_ReadLatestGoalList_QNAME, ReadLatestGoalList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "updateGoalResponse")
    public JAXBElement<UpdateGoalResponse> createUpdateGoalResponse(UpdateGoalResponse value) {
        return new JAXBElement<UpdateGoalResponse>(_UpdateGoalResponse_QNAME, UpdateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "savePersonMeasure")
    public JAXBElement<SavePersonMeasure> createSavePersonMeasure(SavePersonMeasure value) {
        return new JAXBElement<SavePersonMeasure>(_SavePersonMeasure_QNAME, SavePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "savePersonMeasureResponse")
    public JAXBElement<SavePersonMeasureResponse> createSavePersonMeasureResponse(SavePersonMeasureResponse value) {
        return new JAXBElement<SavePersonMeasureResponse>(_SavePersonMeasureResponse_QNAME, SavePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readMeasureTypeResponse")
    public JAXBElement<ReadMeasureTypeResponse> createReadMeasureTypeResponse(ReadMeasureTypeResponse value) {
        return new JAXBElement<ReadMeasureTypeResponse>(_ReadMeasureTypeResponse_QNAME, ReadMeasureTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "updateGoal")
    public JAXBElement<UpdateGoal> createUpdateGoal(UpdateGoal value) {
        return new JAXBElement<UpdateGoal>(_UpdateGoal_QNAME, UpdateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readMeasureTypes")
    public JAXBElement<ReadMeasureTypes> createReadMeasureTypes(ReadMeasureTypes value) {
        return new JAXBElement<ReadMeasureTypes>(_ReadMeasureTypes_QNAME, ReadMeasureTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBmi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readBmi")
    public JAXBElement<ReadBmi> createReadBmi(ReadBmi value) {
        return new JAXBElement<ReadBmi>(_ReadBmi_QNAME, ReadBmi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "updatePersonMeasure")
    public JAXBElement<UpdatePersonMeasure> createUpdatePersonMeasure(UpdatePersonMeasure value) {
        return new JAXBElement<UpdatePersonMeasure>(_UpdatePersonMeasure_QNAME, UpdatePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readPersonListResponse")
    public JAXBElement<ReadPersonListResponse> createReadPersonListResponse(ReadPersonListResponse value) {
        return new JAXBElement<ReadPersonListResponse>(_ReadPersonListResponse_QNAME, ReadPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureHistoriesByDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readMeasureHistoriesByDate")
    public JAXBElement<ReadMeasureHistoriesByDate> createReadMeasureHistoriesByDate(ReadMeasureHistoriesByDate value) {
        return new JAXBElement<ReadMeasureHistoriesByDate>(_ReadMeasureHistoriesByDate_QNAME, ReadMeasureHistoriesByDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureHistoriesByDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readMeasureHistoriesByDateResponse")
    public JAXBElement<ReadMeasureHistoriesByDateResponse> createReadMeasureHistoriesByDateResponse(ReadMeasureHistoriesByDateResponse value) {
        return new JAXBElement<ReadMeasureHistoriesByDateResponse>(_ReadMeasureHistoriesByDateResponse_QNAME, ReadMeasureHistoriesByDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readMeasureType")
    public JAXBElement<ReadMeasureType> createReadMeasureType(ReadMeasureType value) {
        return new JAXBElement<ReadMeasureType>(_ReadMeasureType_QNAME, ReadMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "updatePersonMeasureResponse")
    public JAXBElement<UpdatePersonMeasureResponse> createUpdatePersonMeasureResponse(UpdatePersonMeasureResponse value) {
        return new JAXBElement<UpdatePersonMeasureResponse>(_UpdatePersonMeasureResponse_QNAME, UpdatePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readPersonList")
    public JAXBElement<ReadPersonList> createReadPersonList(ReadPersonList value) {
        return new JAXBElement<ReadPersonList>(_ReadPersonList_QNAME, ReadPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "saveGoalResponse")
    public JAXBElement<SaveGoalResponse> createSaveGoalResponse(SaveGoalResponse value) {
        return new JAXBElement<SaveGoalResponse>(_SaveGoalResponse_QNAME, SaveGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readQuote")
    public JAXBElement<ReadQuote> createReadQuote(ReadQuote value) {
        return new JAXBElement<ReadQuote>(_ReadQuote_QNAME, ReadQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "saveGoal")
    public JAXBElement<SaveGoal> createSaveGoal(SaveGoal value) {
        return new JAXBElement<SaveGoal>(_SaveGoal_QNAME, SaveGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readMeasureTypesResponse")
    public JAXBElement<ReadMeasureTypesResponse> createReadMeasureTypesResponse(ReadMeasureTypesResponse value) {
        return new JAXBElement<ReadMeasureTypesResponse>(_ReadMeasureTypesResponse_QNAME, ReadMeasureTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readGoalListResponse")
    public JAXBElement<ReadGoalListResponse> createReadGoalListResponse(ReadGoalListResponse value) {
        return new JAXBElement<ReadGoalListResponse>(_ReadGoalListResponse_QNAME, ReadGoalListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLatestGoalListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readLatestGoalListResponse")
    public JAXBElement<ReadLatestGoalListResponse> createReadLatestGoalListResponse(ReadLatestGoalListResponse value) {
        return new JAXBElement<ReadLatestGoalListResponse>(_ReadLatestGoalListResponse_QNAME, ReadLatestGoalListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_storage.ehealth/", name = "readGoalList")
    public JAXBElement<ReadGoalList> createReadGoalList(ReadGoalList value) {
        return new JAXBElement<ReadGoalList>(_ReadGoalList_QNAME, ReadGoalList.class, null, value);
    }

}
